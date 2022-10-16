package ru.netology.javaqa.javamvn.hwsqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javamvn.hwsqr.SQRServiceRange;

public class SQRServiceRangeTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/numberSqrt.csv")
    public void countSqrtTest(int expected, int low, int high){
        SQRServiceRange service = new SQRServiceRange();

        int actual = service.countSqrt(low, high);

        Assertions.assertEquals(expected, actual);
    }
}
