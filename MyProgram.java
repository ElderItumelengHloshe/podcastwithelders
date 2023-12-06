public void writeToFile(Path path, String content) {
    try {
        Files.write(path, content.getBytes());
    } catch (IOException e) {
        // exception handling ...
    }
}