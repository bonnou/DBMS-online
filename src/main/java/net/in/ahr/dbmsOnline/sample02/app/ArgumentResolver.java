package net.in.ahr.dbmsOnline.sample02.app;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
