/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class prmenu
/*    */ {
/*    */   public void ssMenu()
/*    */   {
/*  7 */     String answ = JOptionPane.showInputDialog("What would you like to do ?  \n 1: Calculate Square/Rectangle Area \n 2: Calculate Triangle Area \n 3: Calculate Circle Area (with radius) \n 4: Calculate Circle Area (with diameter) \n  \n  \n  \n  \n  \n Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     int answer = Integer.parseInt(answ);
/*    */     
/* 26 */     if (answer == 1) {
/* 27 */     areaCalc uTheo = new areaCalc();
/* 28 */     uTheo.uTheorem(); }
			 if (answer == 2) { areaCalc uTheo = new areaCalc();
			   uTheo.rTheorem(); }
			 if (answer == 3) {
				 areaCalc uTheo = new areaCalc();
				   uTheo.iuTheorem(); }
		     if (answer == 4) {
		    	 areaCalc uTheo = new areaCalc();
				uTheo.irTheorem(); }
		     // if (answer == 5) {
		     //	 areaCalc uTheo = new areaCalc();
		     //	 uTheo.iuaTheorem();
		     //}
		     //if (answer == 6) {
		     //	 areaCalc uTheo = new areaCalc();
		     //	 uTheo.iraTheorem(); 
		     //}
			
			
			
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.pmenu
 * JD-Core Version:    0.6.2
 */