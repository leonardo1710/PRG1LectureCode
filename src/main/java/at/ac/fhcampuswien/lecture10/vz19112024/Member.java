package at.ac.fhcampuswien.lecture10.vz19112024;


public class Member implements Comparable<Member>{
    private String name;
    private int height; // in cm

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    @Override
    public int compareTo(Member o) {
        return this.height - o.getHeight();
    }
}
