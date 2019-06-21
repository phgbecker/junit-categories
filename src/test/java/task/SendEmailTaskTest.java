package task;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import task.category.ProductionEnvironment;
import task.category.StageEnvironment;

import static org.assertj.core.api.Assertions.assertThat;

public class SendEmailTaskTest {

    @Test
    @Category(
            StageEnvironment.class
    )
    public void givenEmailTaskOnStage_whenRun_thenIsTrue() {
        Task<String> emailTask = new SendEmailTask();
        assertThat(emailTask.run("name.lastname@stage")).isTrue();
    }

    @Test
    @Category(
            ProductionEnvironment.class
    )
    public void givenEmailTaskOnProduction_whenRun_thenIsTrue() {
        Task<String> emailTask = new SendEmailTask();
        assertThat(emailTask.run("name.lastname@production")).isTrue();
    }
}