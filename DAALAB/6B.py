#                                                               EX NO:6B
import heapq
from collections import defaultdict
class Node:
    
    def __init__(self, symbol=None, freq=None):
        self.symbol = symbol  
        self.freq = freq     
        self.left = None    
        self.right = None
    def __lt__(self, other):
        return self.freq < other.freq
    def __eq__(self, other):
        return self.freq == other.freq

def build_huffman_tree(symbol_freq):
    heap = []
    for symbol, freq in symbol_freq.items():
        heapq.heappush(heap, Node(symbol, freq))
    while len(heap) > 1:
        left = heapq.heappop(heap)
        right = heapq.heappop(heap)
        merged = Node(None, left.freq + right.freq)
        merged.left = left
        merged.right = right
        heapq.heappush(heap, merged)
    return heap[0]

def generate_huffman_codes(root, current_code="", codes=None):
    if codes is None:
        codes = {}
    if root.symbol is not None:
        codes[root.symbol] = current_code
        return codes
    if root.left:
        generate_huffman_codes(root.left, current_code + "0", codes)
    if root.right:
        generate_huffman_codes(root.right, current_code + "1", codes)
    return codes

def huffman_encoding(data):
    symbol_freq = defaultdict(int)
    for symbol in data:
        symbol_freq[symbol] += 1
    root = build_huffman_tree(symbol_freq)
    huffman_codes = generate_huffman_codes(root)
    encoded_data = ''.join(huffman_codes[symbol] for symbol in data)
    return encoded_data, huffman_codes

def huffman_decoding(encoded_data, huffman_codes):
    reverse_huffman_codes = {v: k for k, v in huffman_codes.items()}
    current_code = ""
    decoded_data = []
    for bit in encoded_data:
        current_code += bit
        if current_code in reverse_huffman_codes:
            decoded_data.append(reverse_huffman_codes[current_code])
            current_code = ""
    return ''.join(decoded_data)
if __name__ == "__main__":
    data = "AAABBBCCCDDDDEEEE"
    
   
    encoded_data, huffman_codes = huffman_encoding(data)
    print("Huffman Codes:", huffman_codes)
    print("Encoded Data:", encoded_data)
    
    
    decoded_data = huffman_decoding(encoded_data, huffman_codes)
    print("Decoded Data:", decoded_data)
'''
OUTPUT 
Huffman Codes: {'B': '00', 'E': '01', 'D': '10', 'A': '110', 'C': '111'}
Encoded Data: 1101101100000001111111111010101001010101
Decoded Data: AAABBBCCCDDDDEEEE
'''