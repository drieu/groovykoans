/*
 * Copyright © 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan12

class HardWorker implements Worker {

    @Override
    int work(int number) {
        Thread.sleep(1000)
        return number + 10;
    }
}
