package techproed.utilities;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersPractice implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart methodu calisti");
        System.out.println("context.getName())" + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish methodu calisti");
        System.out.println("context.getName())"+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart methodu calisti");
        System.out.println("result.getName() = " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess methodu calisti");
        System.out.println("result.getName() = " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure methodu calisti");
        System.out.println("result.getName() = " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped methodu calisti");
        System.out.println("result.getName() = " + result.getName());

    }

    private int retryCount = 0;
    private static final int maxRetryCount = 1;
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersPractice.class);
    }
}
