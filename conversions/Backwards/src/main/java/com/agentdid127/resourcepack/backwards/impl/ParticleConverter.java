package com.agentdid127.resourcepack.backwards.impl;

import com.agentdid127.resourcepack.library.Converter;
import com.agentdid127.resourcepack.library.PackConverter;
import com.agentdid127.resourcepack.library.pack.Pack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ParticleConverter extends Converter {

    private Path particles;

    //Set it up.
    public ParticleConverter(PackConverter packConverter) {
        super(packConverter);
    }

    @Override
    public void convert(Pack pack) throws IOException {

        //The directory to convert
        particles = pack.getWorkingPath().resolve("assets" + File.separator + "minecraft" + File.separator + "particles");

        Files.copy(particles.resolve("block_marker.json"), particles.resolve("block_marker.json"));
        Files.move(particles.resolve("block_marker.json"), particles.resolve("light.json"));

    }
}