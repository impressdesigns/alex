package com.impressdesigns.alex;

import org.hibernate.dialect.DatabaseVersion;
import org.hibernate.dialect.Dialect;

public class FileMakerDialect extends Dialect {
    public FileMakerDialect() {
        super(DatabaseVersion.make(0));
    }
}
