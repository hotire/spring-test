package com.github.hotire.springtest.arch_unit.service;

import com.github.hotire.springtest.arch_unit.repository.ArchRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArchService {
    private final ArchRepository archRepository;
}
