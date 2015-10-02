package org.abhishek.fileanalytics.parse.helper;

import org.abhishek.fileanalytics.algo.StringMatcher;
import org.abhishek.fileanalytics.algo.impl.KnuthMorrisPrattAlgo;
import org.abhishek.fileanalytics.exception.ValidationFailureException;
import org.abhishek.fileanalytics.parse.AbstractParseHelper;

public class VerifyMatchHelper extends AbstractParseHelper<Boolean> {
    private StringMatcher matcher = null;

    public VerifyMatchHelper(String match) {
        super();
        if (null == match || "".equals(match.trim())) {
            throw new ValidationFailureException("Start Separator configured as Null/Empty");
        }
        matcher = new KnuthMorrisPrattAlgo(match.toCharArray());
    }

    @Override
    public Boolean parseInternal(char[] lineData, int startPosn, int endPosn) {
        return this.matcher.matched(lineData, startPosn, endPosn);
    }
}
