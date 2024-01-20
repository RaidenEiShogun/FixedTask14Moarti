package org.example.demo2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExportDrawings {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String FILE_PATH = "C:\\Users\\Windows\\IdeaProjects\\quickfix\\src\\main\\java\\org\\example\\demo2\\drawings.json";

    public static void exportDrawings(List<FilledRect> rects) {
        try {
            String json = objectMapper.writeValueAsString(rects);
            Files.writeString(Paths.get(FILE_PATH), json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
