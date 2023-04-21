import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.home_work.VacationService;

public class VacationServiceTest {

    @Test
    void shouldCalculateForRestThreeMonth() {
        VacationService service = new VacationService();

        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
