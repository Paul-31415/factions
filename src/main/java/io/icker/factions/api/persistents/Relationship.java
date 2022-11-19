package io.icker.factions.api.persistents;

import io.icker.factions.database.Field;

import java.util.ArrayList;
import java.util.UUID;

public class Relationship {
    public enum Status {
        ALLY,
        NEUTRAL,
        ENEMY,
    }

    public enum Permissions {
        USE_BLOCKS,
        BREAK_BLOCKS,
        USE_ITEMS,
        USE_ENTITIES,
        ATTACK_ENTITIES,
        USE_INVENTORIES
    }

    @Field("Target")
    public UUID target;

    @Field("Status")
    public Status status;

    @Field("Permissions")
    public ArrayList<Permissions> permissions = new ArrayList<>();

    public Relationship(UUID target, Status status) {
        this.target = target;
        this.status = status;
    }

    @SuppressWarnings("unused")
    public Relationship() {}
}