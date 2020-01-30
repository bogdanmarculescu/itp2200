package ex04;

// Code example from Introduction to Software Testing, Ammann and Offutt

public class PatternMatcher {
    public static int pat (char[] subject, char[] pattern)
    {
// Post: if pattern is not a substring of subject, return -1
// else return (zero-based) index where the pattern (first)
// starts in subject
        final int NOTFOUND = -1;
        int iSub = 0, rtnIndex = NOTFOUND; boolean isPat = false;
        int subjectLen = subject.length;
        int patternLen = pattern.length;
        while (isPat == false && iSub + patternLen - 1 < subjectLen) {
            if (subject [iSub] == pattern [0]) {
                rtnIndex = iSub; // Starting at zero
                isPat = true;
                for (int iPat = 1; iPat < patternLen; iPat ++) {
                    if (subject[iSub + iPat] != pattern[iPat]) {
                        rtnIndex = NOTFOUND; isPat = false;
                        break; // out of for loop
                    } }
            }
            iSub ++; }
        return (rtnIndex); }
}
