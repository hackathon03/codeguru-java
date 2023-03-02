package com.hackathon03.codeguru.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.util.Collection;
import java.util.Optional;

public class InsufficientUseOfStreamSorting {

    Optional<String> streamSortThenFindFirstNoncompliant(final Collection<String> col) {
        // Noncompliant: uses sorted and findFirst over min, max stream methods.
        return col.stream()
                .sorted()
                .findFirst();
    }



}
