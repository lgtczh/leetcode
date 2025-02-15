package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PartialMatchTableBuilderTest {
    private final PartialMatchTableBuilder builder = new PartialMatchTableBuilder();

    @Test
    public void should_return_empty_pmt_when_pattern_is_empty() {
        String pattern = "";
        int[] expected = {};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_return_zero_pmt_when_pattern_has_no_overlap() {
        String pattern = "abc";
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_compute_correct_pmt_when_pattern_has_overlap() {
        String pattern = "ababaca";
        int[] expected = {0, 0, 1, 2, 3, 0, 1};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_compute_correct_pmt_when_pattern_is_all_same_characters() {
        String pattern = "aaaaa";
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_compute_correct_pmt_when_pattern_has_partial_overlap() {
        String pattern = "aabaabaaa";
        int[] expected = {0, 1, 0, 1, 2, 3, 4, 5, 2};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_compute_correct_pmt_when_pattern_has_single_character() {
        String pattern = "a";
        int[] expected = {0};
        assertArrayEquals(expected, builder.build(pattern));
    }

    @Test
    public void should_compute_correct_pmt_when_pattern_has_mixed_overlap() {
        String pattern = "abacababc";
        int[] expected = {0, 0, 1, 0, 1, 2, 3, 2, 0};
        assertArrayEquals(expected, builder.build(pattern));
    }
}