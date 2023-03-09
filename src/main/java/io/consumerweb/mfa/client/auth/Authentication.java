package io.consumerweb.mfa.client.auth;

import java.util.Map;

import io.consumerweb.mfa.client.Pair;

import java.util.List;

public interface Authentication
{
    void applyToParams(final List<Pair> p0, final Map<String, String> p1);
}
