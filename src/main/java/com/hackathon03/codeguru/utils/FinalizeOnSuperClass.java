package com.hackathon03.codeguru.utils;

import java.io.BufferedReader;
import java.io.IOException;

public class FinalizeOnSuperClass {

    protected abstract class FeedParser {
        @Override
        protected abstract void finalize() throws IOException;
    }

    protected abstract class ETLFeedParser extends FeedParser {
        private BufferedReader feedReader;
        // Noncompliant: does not call super.finalize().
        @Override
        protected void finalize() throws IOException {
            feedReader.close();

            /*
try {
                feedReader.close();
            }
            finally {
                super.finalize();
            }

 */
        }
    }


}
