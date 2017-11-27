package espresso.priteshpatel.com.androidespressoexample;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest
{

    @Mock
    Context mMockContext;
    private static final String FAKE_STRING = "HELLO WORLD";

    @Test
    public void addition_isCorrect() throws Exception
    {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void readStringFromContext_LocalizedString()
    {
        /*// Given a mocked Context injected into the object under test...
        when(mMockContext.getString(R.string.app_name))
                .thenReturn(FAKE_STRING);
        ClassUnderTest myObjectUnderTest = new ClassUnderTest(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.getHelloWorldString();

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));*/

    }
}