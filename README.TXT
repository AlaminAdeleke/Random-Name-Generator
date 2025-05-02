RandomName Generator (Java)
===========================

A simple Java class for generating random, fantasy-style names using
alternating consonant and vowel sounds.

Author: Alamin Adeleke
Date: May 2, 2025

-------------------------------------------------------------
Overview
-------------------------------------------------------------
The RandomName class creates random names that sound pronounceable and unique.
It builds names using a mix of consonant and vowel sounds, optionally with a
specified number of syllables.

-------------------------------------------------------------
Features
-------------------------------------------------------------
- Generates random names with 1 to 3 syllables
- Supports custom syllable count
- Capitalizes the first letter of each name
- Allows setting a random seed for reproducibility
- Uses expanded phonetic sets for more name variety

-------------------------------------------------------------
How to Use
-------------------------------------------------------------

1. Generate a random name (1 to 3 syllables):
   String name = RandomName.maker();

2. Generate a name with a specific number of syllables:
   String name = RandomName.maker(2);

3. Set a seed for predictable output:
   RandomName.setSeed(42);

-------------------------------------------------------------
How It Works
-------------------------------------------------------------
- Starts with either a vowel (25%) or a consonant (75%)
- Alternates between vowels and consonants for each syllable
- Ends with a vowel or consonant depending on the last character added
- Final name is capitalized (e.g., "Phodra", "Akreth")

-------------------------------------------------------------
Example Output
-------------------------------------------------------------
Dazo
Tutreo
Badwei
Dwibay
Waslo
Jax

-------------------------------------------------------------
Class Summary
-------------------------------------------------------------

Public Methods:
---------------
- String maker()                 --> Returns a name with 1 to 3 syllables
- String maker(int syllables)   --> Returns a name with a given syllable count
- void setSeed(long seed)       --> Sets seed for Random instance

-------------------------------------------------------------
