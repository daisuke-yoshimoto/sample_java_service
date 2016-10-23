package sample_java_service;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class SampleJavaDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String numberValue = (String) execution.getVariable("number");
		
		try{
			Double.parseDouble(numberValue);
		} catch (NumberFormatException e){
			throw new ActivitiException("数値形式で入力してください。");
		}
	}

}
