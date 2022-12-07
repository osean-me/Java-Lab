package me.osean.effective_java.chapter_01.item_05.factory_method_pattern;

import me.osean.effective_java.chapter_01.item_05.dependency_injection.Dictionary;
import me.osean.effective_java.chapter_01.item_05.dependency_injection.KorDictionary;

public class KorDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return KorDictionary.getInstance();
    }
}
