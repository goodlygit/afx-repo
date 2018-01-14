package com.extent.ex;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.report.base.ExtentTestManager;
import com.report.seq.base.BaseExample;

public class GenerateExtentSeqReport extends BaseExample{
	@Test
	public void manageDepartment() {
	      test = extent.startTest("passTest");
	      test.log(LogStatus.PASS, "Department Cteated");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Department Modified");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Department Deleted");
		Assert.assertTrue(true);
	}

	@Test
	public void manageWorkGroup() {
		 test = extent.startTest("manageWorkGroup");
		test.log(LogStatus.PASS, "Create Work group");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS, "Modify Work group");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS, "Delete Work group");
		Assert.assertTrue(false);
	}
}
