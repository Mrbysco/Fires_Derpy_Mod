package firedingo.mod.fdm.reference;

public class RegistryReference {
	public static enum ModItems {
		CHEESE("cheese", "itemcheese"),
		DERPYINGOT("derpyingot", "itemderpyingot"),
		DERPYINGOT2("derpyingot2", "itemderpyingot2"),
		DERPYPICK("derpypick", "itemderpypick"),
		LEAF("leaf", "itemleaf"),
		UNCHARGEDCRYSTAL("unchargedcrystal", "itemunchargedcrystal");
		
		private String unlocalisedName;
		private String registryName;
		
		ModItems(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}

	public static enum ModBlocks {
		
		COLOURBLOCK("colourblock", "blockcolourblock"),
		DERPYCHEESE("derpycheese", "blockderpycheese"),
		DERPYORE("derpyore", "blockderpyore"),
		DERPYORE2("derpyore2", "blockderpyore2"),
		DERPYPANE("derpypane", "blockderpypane"),
		NOTCHAPPLE("notchapple", "blocknotchapple");
		
		private String unlocalisedName;
		private String registryName;
		
		ModBlocks(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
