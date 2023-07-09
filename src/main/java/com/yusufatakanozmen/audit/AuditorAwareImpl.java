package com.yusufatakanozmen.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        //sistemdeki kullanıcı ismini Session ile almalısın
        return Optional.of("Yusuf Atakan Özmen");
    }
}
