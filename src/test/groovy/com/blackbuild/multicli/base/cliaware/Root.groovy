/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2017 Stephan Pauxberger
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.blackbuild.multicli.base.cliaware

import com.blackbuild.multicli.base.CommandLineAware
import com.blackbuild.multicli.base.SubCommandOf
import picocli.CommandLine

@CommandLine.Command
class Root {
}

@SubCommandOf(Root)
@CommandLine.Command(name = "sub1")
class Sub1 {
}

@SubCommandOf(Root)
@CommandLine.Command(name = "sub2")
class Sub2 implements CommandLineAware {
    private CommandLine commandLine

    @Override
    void setCommandLine(CommandLine commandLine) {
        this.commandLine = commandLine
    }
}

@SubCommandOf(Sub1)
@CommandLine.Command(name = "subsub1")
class SubSub1 {
}


