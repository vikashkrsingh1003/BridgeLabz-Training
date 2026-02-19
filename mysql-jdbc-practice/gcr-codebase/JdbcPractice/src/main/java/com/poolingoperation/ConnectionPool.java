//package com.poolingoperation;
//
//import com.zaxxer.hikari.HikariDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class ConnectionPool {
//	private static HikariDataSource dataSource;
//
//	static {
//		HikariConfig config = new HikariConfig();
//		config.setJdbcUrl("jdbc:mysql://localhost:3306/student_db");
//		config.setUsername("root");
//		config.setPassword("root");
//
//		config.setMaximumPoolSize(10);
//		config.setMinimumIdle(5);
//
//		config.setConnectionTimeout(30000);
//		config.setIdleTimeout(600000);
//		config.setMaxLifetime(1800000);
//
//		config.addDataSourceProperty("cachePrepStmts", "true");
//		config.addDataSourceProperty("prepStmtCacheSize", "250");
//		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//
//		dataSource = new HikariDataSource(config);
//	}
//
//	public static Connection getConnection() throws SQLException {
//		return dataSource.getConnection();
//	}
//
//	public static void closePool() {
//		if (dataSource != null) {
//			dataSource.close();
//		}
//	}
//}
