public class calRunTime {
    public static void main(String[] args) {
        StringBuilder sbuil = new StringBuilder();
        StringBuffer sbuff =  new StringBuffer();

        long starttime = System.currentTimeMillis();

      for(int i=0; i<1000000; i++) {
        sbuff.append("RokI ");
        sbuff.append("LovE ");
        sbuff.append("RinI ");
      }
      System.out.println("Sbuff--> "+ (System.currentTimeMillis()-starttime));

      
      long starttime2 = System.currentTimeMillis();

      for(int i=0; i<1000000; i++) {
        sbuil.append("RokI ");
        sbuil.append("LovE ");
        sbuil.append("RinI ");
      }
      System.out.println("Sbuil--> "+ (System.currentTimeMillis()-starttime2));
    }
}
