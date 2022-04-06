package utils;

import utils.MyDataProvider;
import utils.MyUtils;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MyTest {
    @Test(dataProviderClass = MyDataProvider.class, expectedExceptions = Exception.class, dataProvider = "data")
    public void checkReverseWord(String testString){
        MyUtils.reverseWord(testString);
    }

    @Ignore
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkNull() {
        MyUtils.reverseWord(null);
    }
    @Ignore
    @Test(expectedExceptions = RuntimeException.class)
    public void checkEmptyString() {
        MyUtils.reverseWord("");
    }
    @Ignore
    @Test(expectedExceptions = RuntimeException.class)
    public void checkOneSymbol() {
        MyUtils.reverseWord("1");
    }
    @Ignore
    @Test(expectedExceptions = RuntimeException.class)
    public void checkProbel() {
        MyUtils.reverseWord("1 d 2");
    }
    @Ignore
    @Test
    public void checkReverse() {
        String stringTest = "123";
        String stringExpected = "321";
        String stringActual = MyUtils.reverseWord(stringTest);

        Assert.assertEquals(stringActual, stringExpected, "актуальный результат не соответствует ожидаемому");
    }
}
