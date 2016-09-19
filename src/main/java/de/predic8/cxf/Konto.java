package de.predic8.cxf;

import javax.jws.WebService;

@WebService
public interface Konto {
    Double getSaldo(String kto);
}
