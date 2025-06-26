package core_java_new2;

import inheritance_programs.AccsSpf_OutPkg_BcmSubCls2;

public class AccsSpf_OutPkg_BcmSubCls1  extends AccsSpf_OutPkg_BcmSubCls2
{

	    public static void main(String[] args)
	    {
	    	AccsSpf_OutPkg_BcmSubCls1 a1=new AccsSpf_OutPkg_BcmSubCls1();
	    	a1.sub();
	    	a1.mul();

	    	                 // we can access only public, protected

	    	                // not def/pkg or private

		}

}
