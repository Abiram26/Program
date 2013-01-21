/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class sCalcmenu
/*    */ {
/*    */   public void pkMenu() //We made this yesterday (20-01-13) I don't know if you need it
/*    */   {
/*  7 */     String answ = JOptionPane.showInputDialog("What would you like to do ?" +
														"\n 1: Addition " +
														"\n 2: Subtraction " +
														"\n 3: Square Root " +
														"\n 4: Powers" +
														"\n 5: Multiplication" +
														"\n 6: Division" + 
														"Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     int answer = Integer.parseInt(answ);
/*    */     
/* 26 */     if (answer == 1) {
/* 27 */     simpleCalc uTheo = new simpleCalc();
/* 28 */     uTheo.calcAdd(); }
			 if (answer == 2) { simpleCalc uTheo = new simpleCalc();
			   uTheo.calcSub(); }
			 if (answer == 3) {
				 simpleCalc uTheo = new simpleCalc();
				   uTheo.calcSqr(); }
		     if (answer == 4) {
		    	 simpleCalc uTheo = new simpleCalc();
				uTheo.calcPow(); }
		     if (answer == 5) {
		    	 simpleCalc uTheo = new simpleCalc();
		    	 uTheo.calcMul();
		     }
		     if (answer == 6) {
		    	 simpleCalc uTheo = new simpleCalc();
		    	 uTheo.calcDiv(); 
		     }
			
			
			
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.pmenu
 * JD-Core Version:    0.6.2
 */