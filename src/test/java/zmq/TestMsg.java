/*
    Copyright (c) 2007-2014 Contributors as noted in the AUTHORS file

    This file is part of 0MQ.

    0MQ is free software; you can redistribute it and/or modify it under
    the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation; either version 3 of the License, or
    (at your option) any later version.

    0MQ is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package zmq;

import org.junit.*;
import java.nio.ByteBuffer;

import static org.junit.Assert.assertEquals;

public class TestMsg {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNullByteBuffer() {
        new Msg((ByteBuffer)null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForBufferWithWrongPosition() {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putChar('a');
        buffer.putChar('b');
        buffer.putChar('c');
        new Msg(buffer);
    }

    @Test
    public void shouldWorkForFlippedBuffers() {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putChar('a');
        buffer.putChar('b');
        buffer.putChar('c');
        buffer.flip();
        new Msg(buffer);
    }
}
