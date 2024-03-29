/*
 * Copyright © 2017 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.junsigned.core;

import com.io7m.junreachable.UnreachableCodeException;

/**
 * Functions dealing with unsigned {@code int} values.
 */

public final class UnsignedInt
{
  private UnsignedInt()
  {
    throw new UnreachableCodeException();
  }

  /**
   * Calculate the unsigned modulo {@code x % y}.
   *
   * @param x The dividend
   * @param y The divisor
   *
   * @return The unsigned modulo {@code x % y}
   *
   * @throws ArithmeticException Iff {@code y < 0}
   */

  public static int modulo(
    final int x,
    final int y)
    throws ArithmeticException
  {
    if (y < 0) {
      throw new ArithmeticException("Divisor must be positive: " + y);
    }

    final int r = x % y;
    return r < 0 ? r + y : r;
  }
}
