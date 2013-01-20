/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class ptmenu
/*    */ {
/*    */   public void saMenu()
/*    */   {
/*  7 */     String answ = JOptionPane.showInputDialog("What would you like to do ?  \n 1: Calculate Cube/Cuboid Volume \n 2: Calculate Pyramid Volume \n 3: Calculate Sphere Volume (with radius) \n 4: Calculate Sphere Volume (with diameter) \n 5: Calculate Cylinder Volume (with radius) \n 6: Calculate Cylinder Volume (with diameter)  \n 7: Calculate Cone Volume (with radius) \n 8: Calculate Cone Volume (with diameter) \n  \n Made By Abiram26 & Jimlarck \n Version: 1.0.0 ");
/*    */ 
/* 21 */     int answer = Integer.parseInt(answ);
/*    */     
/* 26 */     if (answer == 1) {
/* 27 */     volumeCalc uTheo = new volumeCalc();
/* 28 */     uTheo.uTheorem(); }
			 if (answer == 2) { volumeCalc uTheo = new volumeCalc();
			   uTheo.rTheorem(); }
			 if (answer == 3) {
				 volumeCalc uTheo = new volumeCalc();
				   uTheo.iuTheorem(); }
		     if (answer == 4) {
		    	 volumeCalc uTheo = new volumeCalc();
				uTheo.irTheorem(); }
		     if (answer == 5) {
		    	 volumeCalc uTheo = new volumeCalc();
		    	 uTheo.iuaTheorem();
		     }
		     if (answer == 6) {
		    	 volumeCalc uTheo = new volumeCalc();
		    	 uTheo.iraTheorem(); 
		     }
			if (answer == 7) {
				volumeCalc uTheo = new volumeCalc();
				uTheo.iubTheorem();
			}
			if (answer == 8) {
				volumeCalc uTheo = new volumeCalc();
				uTheo.irbTheorem();
			}
			
			
/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.pmenu
 * JD-Core Version:    0.6.2
 */