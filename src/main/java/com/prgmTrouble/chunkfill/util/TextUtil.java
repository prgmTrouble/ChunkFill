package com.prgmTrouble.chunkfill.util;

import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;

public final class TextUtil
{
    private TextUtil() {}
    
    public static MutableText text(final String str,final Style style)
    {
        final MutableText txt = new LiteralText(str);
        txt.setStyle(style);
        return txt;
    }
}