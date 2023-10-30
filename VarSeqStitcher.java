package tandemVarPacBio;

/**
 * @author Xuewen Wang <xwwang@ymail.com>
 * @version V1.0
 * @since 2023-Oct-30
 * Summary. to build and phase alleles on given SNP, STR, and InDel sites in vcf
 * 
 * 
 * Description.
 * usage: java -jar VarSeqStitcher.jar [pars]
 * help: java -jar VarSeqStitcher.jar
 * 
 **/


public class VarSeqStitcher {
	
	
	public static  void main(String[] args)  {
		try {
			StrFlankVarJoiner.main(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
