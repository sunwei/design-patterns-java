package xyz.sunwei.designpattern.strategy;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

class StrategyTests {

    @Test void given_chinese_when_speak_then_receive_chinese() {
        final ChineseStrategy strategy = mock(ChineseStrategy.class);
        final Speaker speaker = new Speaker(strategy);
        
        speaker.sayHi();

        verify(strategy).execute();
        verifyNoMoreInteractions(strategy);
    }

    @Test void given_chinese_when_change_then_receive_english() {
        final ChineseStrategy chineseStrategy = mock(ChineseStrategy.class);
        Speaker speaker = new Speaker(chineseStrategy);

        speaker.sayHi();
        verify(chineseStrategy).execute();

        final EnglishStrategy englishStrategy = mock(EnglishStrategy.class);
        speaker.changeStrategy(englishStrategy);
        
        speaker.sayHi();
        verify(englishStrategy).execute();
        
        verifyNoMoreInteractions(chineseStrategy, englishStrategy);
    }
    
}
