package Cau3;

public class VanBan {
    private String chuoiVanBan;

    public VanBan() {
    }

    public VanBan(String chuoiVanBan) {
        this.chuoiVanBan = chuoiVanBan;
    }
    public String getChuoiVanBan() {
        return chuoiVanBan;
    }

    public void setChuoiVanBan(String chuoiVanBan) {
        this.chuoiVanBan = chuoiVanBan;
    }
    public int wordCount() {
        String[] words = chuoiVanBan.split("\\s+");
        return words.length;
    }
    public String toUpper() {
        this.chuoiVanBan = this.chuoiVanBan.toUpperCase();
        return chuoiVanBan;
    }
    public String hoaThanhThuong() {
        this.chuoiVanBan = this.chuoiVanBan.toLowerCase();
        return chuoiVanBan;
    }

    public String vietHoaDau() {
        String[] words = chuoiVanBan.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                char firstLetter = word.charAt(0);
                String restOfWord = word.substring(1);
                String capitalizedWord = Character.toUpperCase(firstLetter) + restOfWord;
                result.append(capitalizedWord);
            }
            if (i < words.length - 1) result.append(" ");
        }
        this.chuoiVanBan = result.toString();
        return chuoiVanBan;
    }
    @Override
    public String toString() {
        return "VanBan{" +
                "chuoiVanBan='" + chuoiVanBan + '\'' +
                '}';
    }
}
