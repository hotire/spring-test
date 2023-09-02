package com.github.hotire.springtest.arch_unit.layered.service;

import com.github.hotire.springtest.arch_unit.layered.repository.ArchRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArchService {
    private final ArchRepository archRepository;
}
