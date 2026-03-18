package Day2;


public class ramukaka {
    public void getOrder(String TeaName) {
        try {
            Class cl = Class.forName(TeaName);
            Object obj =cl.newInstance(); //Upcasting
            Tea tea = (Tea)obj; //Down casting
            tea.steps();
            tea.benefits(); // Dynamic Object creation
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}