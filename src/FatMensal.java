
public class FatMensal {
	double val;
	public static void main(String[] args) {
		FatMensal sp = new FatMensal();
		FatMensal rj = new FatMensal();
		FatMensal mg = new FatMensal();
		FatMensal es = new FatMensal();
		FatMensal outros = new FatMensal();
		FatMensal total = new FatMensal();
		sp.val = 67836.43;
		rj.val=36678.66;
		mg.val=29229.88;
		es.val=27165.48;
		outros.val=19849.53;
		total.val = (sp.val+rj.val+mg.val+es.val+outros.val);
		
		System.out.printf("%.2f \n",sp.calcPorcent(sp.val, total.val));
		System.out.printf("%.2f \n",rj.calcPorcent(rj.val, total.val));
		System.out.printf("%.2f \n",mg.calcPorcent(mg.val, total.val));
		System.out.printf("%.2f \n",es.calcPorcent(es.val, total.val));
		System.out.printf("%.2f \n",outros.calcPorcent(outros.val, total.val));
	}
	public double calcPorcent(double estado, double total) {
		return (estado/total)*100;
		
	}
}
