package com.fundoonotesapp.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.fundoonotesapp.entity.Note;

@Service
public class NoteExportService {

    public ByteArrayInputStream exportNotes(List<Note> notes) {

        try (Workbook workbook = new XSSFWorkbook();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            // Create Excel sheet
            Sheet sheet = workbook.createSheet("Notes");

            // =========================
            // Header Row
            // =========================

            Row headerRow = sheet.createRow(0);

            headerRow.createCell(0).setCellValue("ID");
            headerRow.createCell(1).setCellValue("Title");
            headerRow.createCell(2).setCellValue("Content");
            headerRow.createCell(3).setCellValue("Created At");
            headerRow.createCell(4).setCellValue("State");
            headerRow.createCell(5).setCellValue("Pinned");
            headerRow.createCell(6).setCellValue("Reminder At");

            // =========================
            // Data Rows
            // =========================

            int rowNumber = 1;

            for (Note note : notes) {

                Row row = sheet.createRow(rowNumber++);

                row.createCell(0)
                        .setCellValue(note.getNoteId());

                row.createCell(1)
                        .setCellValue(
                                note.getTitle() != null
                                        ? note.getTitle()
                                        : ""
                        );

                row.createCell(2)
                        .setCellValue(
                                note.getContent() != null
                                        ? note.getContent()
                                        : ""
                        );

                row.createCell(3)
                        .setCellValue(
                                note.getCreatedAt() != null
                                        ? note.getCreatedAt().toString()
                                        : ""
                        );

                row.createCell(4)
                        .setCellValue(
                                note.getState() != null
                                        ? note.getState().toString()
                                        : ""
                        );

                row.createCell(5)
                        .setCellValue(note.isPinned());

                row.createCell(6)
                        .setCellValue(
                                note.getReminderAt() != null
                                        ? note.getReminderAt().toString()
                                        : ""
                        );
            }

            // =========================
            // Auto-size columns
            // =========================

            for (int i = 0; i < 7; i++) {
                sheet.autoSizeColumn(i);
            }

            // =========================
            // Write workbook
            // =========================

            workbook.write(outputStream);

            return new ByteArrayInputStream(
                    outputStream.toByteArray()
            );

        } catch (IOException e) {

            throw new RuntimeException(
                    "Failed to export notes to Excel",
                    e
            );
        }
    }
}