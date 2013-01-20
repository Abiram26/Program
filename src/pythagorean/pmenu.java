/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class pmenu
/*    */ {
/*    */   public void pyMenu()
/*    */   {
/*  7 */     String answ = JOptionPane.showInputDialog("What would you like to do ?  \n 1: Unrounded (hypotenuse/C is unknown)  \n 2: Rounded (hypotenuse/C is unknown) \n 3: Unrounded (A is unknown) \n 4: Rounded (A is unknown) \n 5: Unrounded (B is unknown) \n 6: Rounded (B is unknown) \n  \n  \n  \n Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     int answer = Integer.parseInt(answ);
/*    */     
/* 26 */     if (answer == 1) {
/* 27 */     roundedTheorem uTheo = new roundedTheorem();
/* 28 */     uTheo.uTheorem(); }
			 if (answer == 2) { roundedTheorem uTheo = new roundedTheorem();
			   uTheo.rTheorem(); }
			 if (answer == 3) {
				 roundedTheorem uTheo = new roundedTheorem();
				   uTheo.iuTheorem(); }
		     if (answer == 4) {
				roundedTheorem uTheo = new roundedTheorem();
				uTheo.irTheorem(); }
		     if (answer == 5) {
		    	 roundedTheorem uTheo = new roundedTheorem();
		    	 uTheo.iuaTheorem();
		     }
		     if (answer == 6) {
		    	 roundedTheorem uTheo = new roundedTheorem();
		    	 uTheo.iraTheorem(); 
		     }
			
			
			
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.pmenu
 * JD-Core Version:    0.6.2
 */