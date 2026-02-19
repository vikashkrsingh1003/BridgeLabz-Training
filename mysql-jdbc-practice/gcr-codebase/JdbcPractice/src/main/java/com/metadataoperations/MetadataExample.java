package com.metadataoperations;

import java.sql.*;

public class MetadataExample {

	public static void getDatabaseMetadata() {
		try (Connection conn = DatabaseConnection.getConnection()) {

			DatabaseMetaData metaData = conn.getMetaData();

			System.out.println("Database Product: " + metaData.getDatabaseProductName());
			System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

			System.out.println("Driver Name: " + metaData.getDriverName());
			System.out.println("Driver Version: " + metaData.getDriverVersion());
			System.out.println("User: " + metaData.getUserName());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getTableMetadata(String tableName) {
		try (Connection conn = DatabaseConnection.getConnection()) {

			DatabaseMetaData metaData = conn.getMetaData();

			ResultSet columns = metaData.getColumns(null, null, tableName, null);

			System.out.println("Columns in " + tableName + ":");
			while (columns.next()) {
				String columnName = columns.getString("COLUMN_NAME");
				String dataType = columns.getString("TYPE_NAME");
				int size = columns.getInt("COLUMN_SIZE");
				String nullable = columns.getString("IS_NULLABLE");

				System.out.printf("%s %s(%d) Nullable: %s%n", columnName, dataType, size, nullable);
			}

			ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, tableName);

			System.out.println("\nPrimary Keys:");
			while (primaryKeys.next()) {
				String columnName = primaryKeys.getString("COLUMN_NAME");
				System.out.println(columnName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getResultSetMetadata(String query) {
		try (Connection conn = DatabaseConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			ResultSetMetaData rsMetaData = rs.getMetaData();

			int columnCount = rsMetaData.getColumnCount();

			System.out.println("Columns in result set:");
			for (int i = 1; i <= columnCount; i++) {
				String columnName = rsMetaData.getColumnName(i);
				String columnType = rsMetaData.getColumnTypeName(i);
				int displaySize = rsMetaData.getColumnDisplaySize(i);

				System.out.printf("%s (%s) Size: %d%n",

						columnName, columnType, displaySize);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getDatabaseMetadata();
		System.out.println("\n---\n");
		getTableMetadata("students");
		System.out.println("\n---\n");
		getResultSetMetadata("SELECT * FROM students LIMIT 1");
	}
}
