package basic.stage01;

import java.util.List;

class White {
    Integer king;
    Integer queen;
    Integer look;
    Integer bishop;
    Integer nite;

    public White(List<Integer> whites) {
        this.king = (Integer)whites.get(0);
        this.queen = (Integer)whites.get(1);
        this.look = (Integer)whites.get(2);
        this.bishop = (Integer)whites.get(3);
        this.nite = (Integer)whites.get(4);
    }

    public White mius(White white) {
        return builder().king(2 - white.king).queen(2 - white.queen).bishop(2 - white.bishop).look(2 - white.look).nite(2 - this.nite).build();
    }

    public static WhiteBuilder builder() {
        return new WhiteBuilder();
    }

    public White(Integer king, Integer queen, Integer look, Integer bishop, Integer nite) {
        this.king = king;
        this.queen = queen;
        this.look = look;
        this.bishop = bishop;
        this.nite = nite;
    }

    public White() {
    }

    public static class WhiteBuilder {
        private Integer king;
        private Integer queen;
        private Integer look;
        private Integer bishop;
        private Integer nite;

        WhiteBuilder() {
        }

        public WhiteBuilder king(Integer king) {
            this.king = king;
            return this;
        }

        public WhiteBuilder queen(Integer queen) {
            this.queen = queen;
            return this;
        }

        public WhiteBuilder look(Integer look) {
            this.look = look;
            return this;
        }

        public WhiteBuilder bishop(Integer bishop) {
            this.bishop = bishop;
            return this;
        }

        public WhiteBuilder nite(Integer nite) {
            this.nite = nite;
            return this;
        }

        public White build() {
            return new White(this.king, this.queen, this.look, this.bishop, this.nite);
        }

        public String toString() {
            return "White.WhiteBuilder(king=" + this.king + ", queen=" + this.queen + ", look=" + this.look + ", bishop=" + this.bishop + ", nite=" + this.nite + ")";
        }
    }
}

