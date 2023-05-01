package com.example.jjdind49_katibar_zad26_1;

public enum Category {
    SOUPS ("Zupy",
            "płynna lub półpłynna potrawa mająca zazwyczaj postać wywaru powstającego podczas gotowania różnorodnych składników. " +
            "W tradycji polskiej zupa jest zwykle pierwszym daniem obiadu. " +
            "Podczas gotowania warzyw, owoców, mięs i kości uwalnia się znaczna ilość zawartych w nich składników.",
            "soup.jpg"),
    MAIN("Dania główne",
            "na danie główne (w kuchniach narodów europejskich będące najczęściej elementem obiadu lub kolacji) " +
            "składają się zwyczajowo takie potrawy jak ryby, mięso, w tym drób, podawane z reguły z sosem, " +
            "ziemniakami, makaronem, kaszą lub ryżem i różnorodnymi warzywami",
            "main.jpg"),
    DESSERTS("Desery",
            "słodka potrawa podawana jako osobne słodkie danie na koniec posiłku (obiadu, kolacji lub przyjęcia), " +
            "ale także na podwieczorek albo podczas niezobowiązującego spotkania o dowolnej porze dnia",
            "dessert.jpg"),
    BREADS("Pieczywo",
            "wyroby wypiekane z mąki, wody i soli w połączeniu z różnymi dodatkami. " +
            "Stanowi jeden z podstawowych składników codziennej diety człowieka.",
            "bread.jpg");

    private String pl;
    private String description;
    private String fileName;

    Category(String pl, String description, String fileName) {
        this.pl = pl;
        this.description = description;
        this.fileName = fileName;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return pl;
    }
}
