package net.citizensnpcs.api.gui;

import java.util.Collection;

public class InventoryMenuPattern {
    private final MenuPattern info;
    private final Collection<InventoryMenuSlot> slots;
    private final Collection<InventoryMenuTransition> transitions;

    public InventoryMenuPattern(MenuPattern info, Collection<InventoryMenuSlot> slots,
            Collection<InventoryMenuTransition> transitions) {
        this.info = info;
        this.slots = slots;
        this.transitions = transitions;
    }
}