package com.nookure.core.inv.parser.item;

import com.nookure.core.inv.parser.adapters.MiniMessageAdapter;
import com.nookure.core.inv.parser.item.action.Actions;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;


@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
  private static final Logger LOGGER = Logger.getLogger(Item.class.getName());
  private static final org.slf4j.Logger log = LoggerFactory.getLogger(Item.class);

  @XmlAttribute(name = "id")
  private String id;

  @XmlAttribute(name = "slot")
  private int slot;

  @XmlAttribute(name = "material")
  private String material;

  @XmlAttribute(name = "head")
  private String head;

  @XmlAttribute(name = "headType")
  private HeadType headType;

  @XmlAttribute
  private int amount;

  @XmlElement(name = "Name")
  @XmlJavaTypeAdapter(MiniMessageAdapter.class)
  private String name;

  @XmlElement(name = "tl")
  private boolean tl;

  @XmlAttribute(name = "enchanted")
  private boolean enchanted;

  @XmlElement(name = "Lore")
  private Lore lore;

  @XmlElement(name = "LiteralLore")
  private LiteralLore literalLore;

  @XmlElement(name = "Actions")
  private Actions actions;

  public String id() {
    return id;
  }

  public Item setId(String id) {
    this.id = id;
    return this;
  }

  public int slot() {
    return slot;
  }

  public Item setSlot(int slot) {
    this.slot = slot;
    return this;
  }

  public String material() {
    return material;
  }

  public Item setMaterial(String material) {
    this.material = material;
    return this;
  }

  public String name() {
    return name;
  }

  public Item setName(String name) {
    this.name = name;
    return this;
  }

  public Lore lore() {
    return lore;
  }

  public Item setLore(Lore lore) {
    this.lore = lore;
    return this;
  }

  public boolean tl() {
    return tl;
  }

  public Item setTl(boolean tl) {
    this.tl = tl;
    return this;
  }

  public boolean enchanted() {
    return enchanted;
  }

  public Item setEnchanted(boolean enchanted) {
    this.enchanted = enchanted;
    return this;
  }

  public Actions actions() {
    return actions;
  }

  public Item setActions(Actions actions) {
    this.actions = actions;
    return this;
  }

  public LiteralLore literalLore() {
    return literalLore;
  }

  public Item setLiteralLore(LiteralLore literalLore) {
    this.literalLore = literalLore;
    return this;
  }

  public String head() {
    return head;
  }

  public Item setHead(String head) {
    this.head = head;
    return this;
  }

  public HeadType headType() {
    return headType;
  }

  public Item setHeadType(HeadType headType) {
    this.headType = headType;
    return this;
  }

  public int amount() {
    if (amount <= 0) {
      return 1;
    }

    if (amount > 64) {
      LOGGER.warning("Amount of item " + id + " is greater than 64, setting to 64");
      return 64;
    }

    return amount;
  }

  public Item setAmount(int amount) {
    this.amount = amount;
    return this;
  }
}
