package com.github.hotire.springtest.arch_unit.layered.controller;

import com.github.hotire.springtest.arch_unit.layered.service.ArchService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArchController {
    private final ArchService archService;
}
