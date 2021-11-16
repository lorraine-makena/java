class student2 {
    int adm_no;
    String subject;
    String name;
    float fee_bal;

    void display() {
        System.out.println(adm_no + " " + subject + " " + name + " " + fee_bal);
    }

    public static void main(String args[]) {
        student2 st = new student2();
        student2 st3 = new student2();
        student2 st4 = new student2();
        st.display();
        st3.display();
        st4.display();
    }
}