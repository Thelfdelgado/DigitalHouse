public record Container(String idNum, String description, String country, boolean dangerous) {

    @Override
    public String toString() {
        return "Container: " + idNum + System.lineSeparator() +
                "Description: " + description + System.lineSeparator() +
                "Country: " + country + System.lineSeparator() +
                "Dangerous: " + dangerous + System.lineSeparator();
    }
}
