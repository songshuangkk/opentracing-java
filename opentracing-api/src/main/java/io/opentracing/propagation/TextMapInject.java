/*
 * Copyright 2016-2019 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.opentracing.propagation;

import io.opentracing.SpanContext;
import io.opentracing.Tracer;

/**
 * {@link TextMapInject} is a built-in carrier for {@link Tracer#inject} only.
 * {@link TextMapInject} implementations allows Tracers to read key:value String
 * pairs from arbitrary underlying sources of data.
 *
 * @see io.opentracing.Tracer#inject(SpanContext, Format, Object)
 */
public interface TextMapInject {

    /**
     * Puts a key:value pair into the TextMapWriter's backing store.
     *
     * @param key a String, possibly with constraints dictated by the particular Format this TextMap is paired with
     * @param value a String, possibly with constraints dictated by the particular Format this TextMap is paired with
     *
     * @see io.opentracing.Tracer#inject(io.opentracing.SpanContext, Format, Object)
     * @see Format.Builtin#TEXT_MAP
     * @see Format.Builtin#HTTP_HEADERS
     */
    void put(String key, String value);
}
